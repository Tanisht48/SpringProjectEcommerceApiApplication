# SpringProjectEcommerceApiApplication
___
## FrameWork and Language
    Framework:SpringBoot
    Language : Java
## Dependencies
    SpringBoot Starter Web
    Lombok
    Validation
    MySql
    JPA
    Swagger Ui

## Data Flow
  ### Schemas
     Address
       1.addressId	integer($int32)
       2.addressName	string
       3. addressLandMark	string
       4. addressState	string
___
    User
      1.userId	integer($int32)
      2.userName	string
      3.userPassword	string
      4.userPhoneNo	string
      5.address	Address{...}
      6.userEmail	string
___
    Product
      1.productId	integer($int32)
      2.productName	string
      3.productPrice	integer($int32)
      4.productDesc	string
      5.productCategory	string  
          Enum:[ ELECTRONICS, HEALTHCARE, CLOTHES, STATIONARY ]
      6.productBrand	string
___
    Orders
      1.orderId	integer($int32)
      2.user	User{...}
      3.products	[Product{...}]
      4.address	Address{...}
      5.productQuantity	integer($int32)

  ### Controller
    user-controller
      1.POST/user
      2.POST/Users
      3.GET/users
      4.GET/user/{Id}
      5.DELETE/user/{id}
___
    product-controller
      1.GET/products
      2.POST/products
      3.POST/product
      4.GET/products/{category}
      5.GET/product/{Id}
      6.DELETE/product/{id}
___
    order-controller
      1.POST/order
      2.GET/Orders
      3.GET/Order/{id}
      4.DELETE/order/{id}
___
    address-controller
    1.GET/addresses
    2.POST/addresses
    3.POST/address
    4.GET/address/{Id}
    5.DELETE/address/{id}

## Project Summary
  In this application we can Create Read Update Delete from the different api that are in this application. 
  There are Mappings used in this application like **manytomany,onetomany,onetoone** for placing orders and Mapping Various entitites with each other  
