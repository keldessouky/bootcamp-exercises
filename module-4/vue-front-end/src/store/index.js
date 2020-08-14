import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        homes: [{
                zip: '43081',
                name: 'test house',
                price: '500,000',
                imagename: require('../assets/house.jpg')
            },
            {
                zip: '43015',
                name: 'test apartment',
                price: '800,000',
                imagename: require('../assets/apartment.jpg')
            },
            {
                zip: '43215',
                name: 'test condo',
                price: '1,000,000',
                imagename: require('../assets/condo.jpg')
            }
        ]
    },
    mutations: {},
    actions: {},
    modules: {}
})