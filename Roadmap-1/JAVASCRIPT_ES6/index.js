// // let & const
// const a = 10;
// const b = 20;

// // arrow function
// const add = (a, b) => a + b;

// // template literal
// console.log(`a = ${a}`);
// console.log(`b = ${b}`);
// let name1 = "Thuy"
// console.log(`name: ${name1}`);

// // Destructuring: lấy các phần tử trong array & object
// let arr = [1, 2, 3, 4, 5]
// let obj = { name: "HuuThuy", age: 22, address: "Tp. DaNang" }

// const [c, d, e, f, g] = arr
// console.log(`c: ${c}`);
// console.log(`d: ${d}`);
// console.log(`g: ${g}`);
// console.log(`e: ${e}`);
// console.log(`f: ${f}`);

// let {name, age} = obj;
// console.log(name, age);

// // Default Parameter
// const greet = (name = "Guest") => console.log(`Hi ${name}`)

// console.log("Hello Javascript dsđs");
// console.log("...");

// // let myName = prompt("Mời nhập tên:")
// console.log(`My name: ${myName}`);
// console.log(typeof myName);

// let nothing = null

// === ARRAY ===
// const arr = [1, 3, 5]
// arr.push(10)
// arr.pop()
// arr.unshift(33)
// arr.shift()
// // arr = [7, 8]
// console.log('arr', arr);

// // === ARROW FUNCTION ===
// const tinhHieu = (a, b) => a - b
// const tinhBinhPhuong = (x) => x**2

// console.log(tinhHieu(7, 6))
// console.log(tinhBinhPhuong(5))

// // === STRING ===

// THAY ĐỔI NỘI DUNG
document.getElementById("text").innerText = "Content";
document.querySelector(".title").innerHTML = "<i>Learning</i>";

// THAY ĐỔI THUỘC TÍNH
let p = document.getElementById("content");
p.style.color = "red";

// THÊM SỰ KIỆN
document
  .getElementById("btn-click")
  .addEventListener(
    "click",
    (document.getElementById("text").innerText = "hahaha")
  );

function myFunction() {
  let node = document.createElement("li");
  console.log("node", node);
  let textNode = document.createTextNode("thunder");
  console.log("textnode", textNode);

  node.appendChild(textNode);
  document.getElementById("myList").appendChild(node);
}
