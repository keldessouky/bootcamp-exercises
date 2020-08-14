<template>
  <div>
      <form v-on:submit.prevent="addBook" class="new-book-form">
    <input type="text" placeholder="Title" class="title-input" v-model="newBook.title"/>
    <input type="text" placeholder="Author" class="author-input" v-model="newBook.author"/>
    <input type="text" placeholder="ISBN" class="isbn-input" v-model="newBook.isbn"/>
    <input type="submit" value="Add Book"/>
    </form>
    
  </div>
</template>

<script>
export default {
    name: 'new-book-form',
    data(){
        return {
            newBook: {
                read:false
            }
        }
    },
    methods: {
        addBook(){
            this.$store.commit('ADD_BOOK', this.newBook);
            this.resetForm();
        },
        resetForm(){
            this.newBook = {
                read: false
            };
        }
    }

}
</script>

<style>
.title-input {
    padding: 10px;
    margin: 10px;
}

.author-input {
    padding: 10px;
    margin: 10px;
}

.isbn-input {
    padding: 10px;
    margin: 10px;
}

</style>