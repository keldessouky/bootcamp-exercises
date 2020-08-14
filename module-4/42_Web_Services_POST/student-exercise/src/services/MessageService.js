import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:3000"
});

export default {

    get(id) {
        return http.get(`/messages/${id}`);
    },
    create(messages) {
        return http.post(`/messages/`, messages);
    },
    update(id, topic) {
        return http.put(`/messages/${id}`, topic);
    },
    delete(id) {
        return http.delete(`/messages/${id}`);
    }

}