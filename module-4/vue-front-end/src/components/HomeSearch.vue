<template>
<div id="main-div">

    <div id="search">
        <label for="zip"> Enter your zip code to find your next dream house</label>
        <input name="zip" type="text"/>
    </div>    
  <table class="steelBlueCols">
    <thead>
      <tr>
        <th>Name</th>
        <th>Zip code</th>
        <th>Price</th>
        <th>Image</th>
      </tr>
    </thead>
    <tbody v-for="home in filteredHomes" v-bind:key="home.name">
      <tr>
        <td>
            <img v-bind:src="home.imagename"/>

        </td>
        <td>{{home.zip}}</td>
        <td>{{home.price}}</td>
        <td>{{home.name}}</td>
      </tr>

    </tbody>
  </table>
  </div>
</template>

<script>
export default {
  name: "home-search",
  data() {
    return {
        zipFilter: ''
    };
  },
  computed: {
      filteredHomes() {
          const homes = this.$store.state.homes;
          return homes.filter(home => {
              return this.zipFilter === '' ? true : this.zipFilter === home.zip;
          });
      }
  }
}
</script>

<style scoped>
img {
    width: 150px;
    height: auto;
}

#main-div {
    margin: 30px;
}
input[type=text] {
    margin: 30px;
    padding: 12px 20px;
    box-sizing: border-box;
    border: 2px solid green;
    border-radius: 6px;
}
#search {
    margin: 30px;
   
}

table.steelBlueCols {
  margin:auto;  
  border: 4px solid #555555;
  background-color: #555555;
  width: 80%;
  text-align: center;
  border-collapse: collapse;
}
table.steelBlueCols td,
table.steelBlueCols th {
  border: 1px solid #555555;
  padding: 5px 10px;
}
table.steelBlueCols tbody td {
  font-size: 12px;
  font-weight: bold;
  color: #ffffff;
}
table.steelBlueCols td:nth-child(even) {
  background: #398aa4;
}
table.steelBlueCols thead {
  background: #398aa4;
  border-bottom: 10px solid #398aa4;
}
table.steelBlueCols thead th {
  font-size: 15px;
  font-weight: bold;
  color: #ffffff;
  text-align: left;
  border-left: 2px solid #398aa4;
}
table.steelBlueCols thead th:first-child {
  border-left: none;
}

table.steelBlueCols tfoot td {
  font-size: 13px;
}
table.steelBlueCols tfoot .links {
  text-align: right;
}
table.steelBlueCols tfoot .links a {
  display: inline-block;
  background: #ffffff;
  color: #398aa4;
  padding: 2px 8px;
  border-radius: 5px;
}
</style>