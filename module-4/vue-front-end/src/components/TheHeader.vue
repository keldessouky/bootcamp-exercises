<template>
  <div>
    <img src="../assets/jumpman.jpg" />
    <h1>{{pageTitle}}</h1>
    <nav>
      <a href="#">About</a>
      <a href="#">About</a>
      <a href="#">About</a>
    </nav>
  </div>
</template>

<script>
export default {
  name: "the-header",
  data() {
    return {
      pageTitle: "Java Green Home Search",
    };
  },
};
</script>

<style scoped>
nav {
  display: flex;
  justify-content: center;
  flex-wrap: wrap;
}
nav a {
  text-decoration: none;
  display: block;
  padding: 35px 45px;
  text-align: center;
  background-color: #398aa4;
  color: rgb(55, 7, 104);
  margin: 0;
  font-family: sans-serif;
}
nav a:hover {
  color: silver;
}
img {
  width: 15%;
  height: auto;
}
</style>