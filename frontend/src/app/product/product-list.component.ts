import { Component, OnInit } from "@angular/core";
import { IProduct } from "src/app/product/product";
import { ProductService } from "./product.service";
import { HttpClient } from "@angular/common/http";
import {HttpParams} from  "@angular/common/http";


@Component({
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  pageTitle = 'Product list';
  imageWidth: number = 50;
  imageMargin: number = 2;
  showImage: boolean = false;
  errorMessage: string;
  url: string = 'http://localhost:8080';
  _listFilter = '';
  get listFilter(): string {
    return this._listFilter;
  }
  set listFilter(value: string) {
    this._listFilter = value;
    this.filteredProducts = this.listFilter ? this.performFilter(this.listFilter) : this.products;
  }

  filteredProducts: IProduct[];
  constructor(private productService: ProductService,
              private http: HttpClient) {
  }
  ngOnInit(): void {

    console.log('on initialization');
    // this.productService.getProducts().subscribe(
    //   products => {
    //     this.products = products,
    //     this.filteredProducts = this.products;
    //   },
    //   error => this.errorMessage = <any>error
    // );

    this.productService.getProductsFromBackend().subscribe(
      products => {
        this.products = products,
        this.filteredProducts = this.products;
      },
      error => this.errorMessage = <any>error
    );
  }

  toggleImage(): void {
    this.showImage = !this.showImage;
  }

  performFilter(filterBy: string): IProduct[] {
    filterBy = filterBy.toLocaleLowerCase();
    return this.products.filter((product: IProduct) =>
      product.productName.toLocaleLowerCase().indexOf(filterBy) !== -1);
  }

  onRatingClicked(message: string): void {
    this.pageTitle = 'Product list: ' + message;
  }
}
