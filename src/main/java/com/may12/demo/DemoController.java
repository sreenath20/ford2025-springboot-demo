package com.may12.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
   // HTTP methods
    // CRUD
    // Create : HTTP POST
    // Read : HTTP GET
    // Update: HTTP PUT -> complete replacement of data / resource
    // Partial update: HTTP PATCH
    // Delete : HTTP DELETE

    // Handler method
    @GetMapping("/")  // http:localhost:8080/
    public String greet(){

        return "Hello " ;
    }
    @GetMapping("/greet")  // http:localhost:8080/
    public String greetFord(){

        return "Hello Ford";
    }
    @PostMapping("/")
    public String postData(){
        return "Post data";
    }
    @PutMapping("/")
    public String putData(){
        return "PUT method called";
    }
    @PatchMapping("/")
    public String patchData(){
        return "Patch method called";
    }
    @DeleteMapping("/")
    public String deleteData(){
        return "DELETE method called";
    }

    @GetMapping("/user/{id}")
    public String getUserDetails(@PathVariable("id") Integer id){
        return "data of ID:"+id;
    }

    @GetMapping("/user/{id}/payment/{paymentID}")
    public String getUserPaymentDetails(@PathVariable("id") Integer id,@PathVariable("paymentID") Integer paymentId){
        return "data of ID:"+id +":Pay id:"+paymentId;
    }

    @PostMapping("/user")
    public Wallet createNewWalletUser(@RequestBody Wallet newWallet){ // Jakson
        return newWallet; // jakson is send JSON of object
    }
    @PatchMapping("/user")
    public Wallet patchWalletUser(@RequestBody Wallet newWallet){ // Jakson
        return newWallet; // jakson is send JSON of object
    }
    @PutMapping("/user")
    public Wallet updateWalletUser(@RequestBody Wallet newWallet){ // Jakson
        return newWallet; // jakson is send JSON of object
    }
    @DeleteMapping("/user")
    public Wallet deleteWalletUser(@RequestBody Wallet newWallet){ // Jakson
        return newWallet; // jakson is send JSON of object
    }
    @GetMapping("user")
    public Wallet getWalletUser(@RequestBody Wallet newWallet){ // Jakson
        return newWallet; // jakson is send JSON of object
    }


}
