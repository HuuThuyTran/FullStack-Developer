<template>
    <div>
        <h3>Todo List</h3>
        <div class="todo-form">
            <label for="todo">Input Todo: </label>
            <input type="text" placeholder="Enter todo..." v-model="newTodo" />
            <button @click="addTodo">+ Add</button>
        </div>
    </div>
</template>
<script setup>
import { ref } from 'vue'


const newTodo = ref('')
const todos = ref([])

const addTodo = () => {
    if (newTodo.value.length > 20) {
        alert('Todo item is too long. Please limit to 20 characters.')
    } else if (newTodo.value.trim() === '') {
        alert('Please enter a todo item.')
    }
    console.log(111, newTodo.value);
    todos.value.push(newTodo.value)
    console.log(222, todos.value);
}

</script>

<style scoped>
/* Bạn hãy thiết kế cho tôi một form todolist để nhập */
div {
    margin: 1rem 0;
    display: flex;
    align-items: center;
}

h3 {
    display: block;
}

.todo-form {
    margin-left: 1rem;
    display: flex;
    align-items: center;

}

input[type="text"] {
    flex: 1;
    padding: 0.5rem;
    border: 1px solid #ccc;
    border-radius: 4px;
}

button {
    margin-left: 0.5rem;
    padding: 0.5rem 1rem;
    background-color: #28a745;
    color: white;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

button:hover {
    background-color: #218838;
}

</style>