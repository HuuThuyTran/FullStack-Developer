<script setup>
import { ref } from 'vue';

const imgUrl = "https://hips.hearstapps.com/hmg-prod/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg?crop=0.752xw:1.00xh;0.175xw,0&resize=1200:*";
const isActive = ref(true);
const href = "https://www.webdog.co.nz/";
const color = "yellow";
const fontSize = "24px";
const fontWeight = "bold";

import HelloWorld from "./Hellowrod.vue";
import About from "./About.vue";

const currentComponent = ref("HelloWorld");
const components = { HelloWorld, About };
</script>

<template>
    <h2>Lesson2: Dynamic Value</h2>
    <!-- Ex1: Dynamic attribute -->
    <img :src="imgUrl" alt="img_dog" style="width: 250px; height: 200px;">
    <div :class="{ 'text-green-500': isActive, 'text-red-500': !isActive }">
        This is: {{ isActive ? "a dog!" : "not a dog!" }}
    </div>
    <a :href="href" target="_blank">webdog.co.nz</a>
    <!-- Ex2: Dynamic inline style -->
    <div :style="{ color: color, fontSize: fontSize, fontWeight: fontWeight }">Yellow dog</div>
    <!-- Ex3: Dynamic component -->
    <component :is="components[currentComponent]" />
    <button @click="currentComponent = 'HelloWorld'">HelloWorld</button>
    <button @click="currentComponent = 'About'">About</button>
</template>