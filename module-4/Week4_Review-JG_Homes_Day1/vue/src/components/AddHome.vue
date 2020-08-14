<template>
  <div id="addHomeform">
      <div class="status-message.error" v-show="errorMsg !== '' "> {{errorMsg}} </div>
      <from class="homeForm" v-on:submit.prevent="submitForm">
          <div class="form-group">
              <label for="mlsNumber">MLS Number:</label>
              <input type="text" id="mlsNumber" class="mlsNumber" v-model="home.mlsNumber">
              </div>
              <div class="form-group">
                  <label for="zip">Zip:</label>
                  <input type="text" id="zip" class="form-control" v-model="home.zip">
              </div>
              <div class="form-group">
                  <label for="state">State:</label>
                  <input type="text" id="state" class="form-control" v-model="home.state">
              </div>
              <div class="form-group">
                  <label for="city">City:</label>
                  <input type="text" id="city" class="form-control" v-model="home.city">
              </div>
              <div class="form-group">
                  <label for="address">Address:</label>
                  <input type="text" id="address" class="form-control" v-model="home.address">
              </div>

              <div class="form-group">
                  <label for="price">Price:</label>
                  <input type="text" id="price" class="form-control" v-model="home.price">
              </div>
              <div class="form-group">
            <label for="imageName">Image Name (no path needed):</label>
              <input type="text" id="imageName" class="form-control" v-model="home.imageName" />    
        </div>

        <button class="btn btn-submit">Submit</button>
        <button class="btn btn-cancel" type="cancel">Cancel</button>  
      </from>
  </div>
</template>

<script>

import homeService from '../services/HomeService.js';
export default {
    name: "add-home",

    data() {
        return {
            home: {
                mlsNumber: "",
                address: "",
                city: "",
                state: "",
                zip: "",
                price: "",
                imageName: ""
            },
            errorMsg: ""
        };
    },
    methods: {
        submitForm() {
            const newHome = {
                mlsNumber: this.home.mlsNumber,
                address: this.home.address,
                city: this.home.city,
                state: this.home.state,
                zip: this.home.zip,
                price: this.home.price,
                imageName: this.home.imageName
            };
            // call our web service
            homeService.addHome(newHome).then(response=>{
                if(response.status===201) {
                    //successful
                    this.$router.push('search');
                }
            })
            .catch(error => {
                //error occurred
                if (error.response) {
                    this.errorMsg = "Error adding a new home. Response received was: " + error.response.statusText + "!";
                }
                else if (error.request) {
                    this.errorMsg = "Server unavailable";
                }
                else {
                    this.errorMsg = "General Error";
                }
                console.log(error.status);
            });
        },
        cancelForm(){
            this.$router.push('search');
        }
    }

}
</script>

<style>

</style>