<template>
  <table id="tblUsers">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Username</th>
        <th>Email Address</th>
        <th>Status</th>
    </tr>
    </thead>
    <tbody>
      <tr>
        <td><input type="text" id="firstNameFilter" v-model.trim="filter.firstName"/></td>
        <td><input type="text" id="lastNameFilter" v-model.trim="filter.lastName"/></td>
        <td><input type="text" id="usernameFilter" v-model.trim="filter.username"/></td>
        <td><input type="text" id="emailFilter" v-model.trim="filter.emailAddress"/></td>
        <td>
          <select id="statusFilter" v-model.trim="filter.status">
            <option value="">Show All</option>
            <option value="Active">Active</option>
            <option value="Disabled">Disabled</option>
          </select>
        </td>
      </tr>
      <!-- user listing goes here -->
      
      
        <tr v-for="user in filteredList" v-bind:key="user.id" v-bind:class="{disabled: user.status === 'Active' ? false : true}">
          <td>{{user.firstName}}</td>
          <td>{{user.lastName}}</td>
          <td>{{user.username}}</td>
          <td>{{user.emailAddress}}</td>
          <td>{{user.status}}</td>

        </tr>

    </tbody>
  </table>
</template>

<script>
export default {
  name: 'user-list',
  data() {
    return {
      users: [
        { firstName: 'John', lastName: 'Smith', username: 'jsmith', emailAddress: 'jsmith@gmail.com', status: 'Active' },
        { firstName: 'Anna', lastName: 'Bell', username: 'abell', emailAddress: 'abell@yahoo.com', status: 'Active' },
        { firstName: 'George', lastName: 'Best', username: 'gbest', emailAddress: 'gbest@gmail.com', status: 'Disabled' },
        { firstName: 'Ben', lastName: 'Carter', username: 'bcarter', emailAddress: 'bcarter@gmail.com', status: 'Active' },
        { firstName: 'Katie', lastName: 'Jackson', username: 'kjackson', emailAddress: 'kjackson@yahoo.com', status: 'Active' },
        { firstName: 'Mark', lastName: 'Smith', username: 'msmith', emailAddress: 'msmith@foo.com', status: 'Disabled' }
      ],
      filter:{firstName: '', lastName: '', username: '', emailAddress: '', status: ''}
    }
  },
  computed: {
    filteredList() {
      return this.users.filter( (user) => {
        let first = user.firstName.toLowerCase();
        let last = user.lastName.toLowerCase();
        let username = user.username.toLowerCase();
        let email = user.emailAddress.toLowerCase();

        if(first.includes(this.filter.firstName.toLowerCase()) &&
        last.includes(this.filter.lastName.toLowerCase()) &&
        username.includes(this.filter.username.toLowerCase()) &&
        email.includes(this.filter.emailAddress.toLowerCase()) &&
        user.status.includes(this.filter.status)){
          return true;
        } else {
          return false;
        }

      });
    }
  }
}
</script>

<style scoped>
table {
  margin-top: 20px;
  font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif
}
th {
  text-transform: uppercase
}
td {
  padding: 10px;
}
tr.disabled {
  color: red;
}
input, select {
  font-size: 16px;
}
</style>
