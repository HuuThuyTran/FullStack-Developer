<script setup>
import { computed, ref } from "vue"

const name = "HuuThuy"
const imageMessiUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5kRN7cXw-tjLFCBJZ6hL14tR8N1cVmO1jFw&s"
const imageSonUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPa8toTPMWo2Go4nWhpmHJzbJXVmzOea9y6Q&s"
const alt = "Lionel Messi"

function handleClick() {
    alert(`Hello, ${name}`);
}

const isLogin = true

const isShow = ref(true)

const soccers = ['Lionel Messi', 'Cristiano Ronaldo', 'Neymar Jr', 'Son-Heung Min']
let message = ref('')

const isActive = true
const textColor = ref('blue')

const firstName = ref('Justin')
const lastName = ref('Martinez')
// const fullName = firstName.value + " " + lastName.value
const fullName = computed(() => firstName.value + " " + lastName.value)
</script>

<template>
    <!-- binding data -->
    <div>Hello, {{ name }}</div>
    <!-- v-bind -->
    <img :src="imageMessiUrl" :alt="alt"> <br>
    <img :src="imageSonUrl" :alt="alt"> <br>
    <!-- v-on -->
    <button @click="handleClick">Click</button>
    <!-- v-if, v-else, v-show -->
    <p v-if="isLogin">Welcome to the app!</p>
    <p v-else>Please log in.</p>
    <p v-show="isLogin">Bạn đã đăng nhập</p>
    <p v-show="!isLogin">Bạn chưa đăng nhập</p>
    <button @click="isShow = !isShow">
        Toggle thông báo.
    </button>
    <p v-show="isShow">Thông báo này dùng v-show</p>
    <p v-if="isShow">Thông báo này dùng v-if</p>
    <!-- v-for -->
    <div>
        <div v-for="soccer in soccers">+ {{ soccer }}</div>
    </div>
    <!-- v-model -->
    <div>
        <label for="message">Message:</label>
        <input type="text" v-model="message" placeholder="Type your message here">
        <p>Your message: {{ message }}</p>
    </div>
    <!-- class & style động -->
    <p :class="{ active: isActive }">Xin chào, mọi người</p>
    <p :style="{ color: textColor, fontSize: '20px' }">Xin chào, VueJS</p>
    <!-- computed() -->
    <div>
        <h3>FORM INFO:</h3>
        <label for="name">First Name:</label>
        <input type="text" v-model="firstName" placeholder="Enter your first name...">
        <label for="name">Last Name:</label>
        <input type="text" v-model="lastName" placeholder="Enter your last name...">
        <p>Full name: {{ fullName }}</p>
    </div>
</template>

