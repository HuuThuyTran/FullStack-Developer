// === Phần 3 - Điều kiện & Vòng lặp ===
// 3.1
// let n = +prompt("Nhập một số n:")
// for (let i = 1 i <= 10 i++) {
//     let result = n * i
//     document.getElementById("multiplicationTable").innerHTML += `${n} x ${i} = ${result}<br>`
// }

// 3.2
// let n1 = +prompt("Nhập một số từ 2 đến 8:")
// switch (n1) {
//   case 2:
//     document.getElementById("day").innerHTML = "<i>Thứ Hai</i>"
//     break
//   case 3:
//     document.getElementById("day").innerHTML = "<i>Thứ Ba</i>"
//     break
//   case 4:
//     document.getElementById("day").innerHTML = "<i>Thứ Tư</i>"
//     break
//     1
//   case 5:
//     document.getElementById("day").innerHTML = "<i>Thứ Năm</i>"
//     break
//   case 6:
//     document.getElementById("day").innerHTML = "<i>Thứ Sáu</i>"
//     break
//   case 7:
//     document.getElementById("day").innerHTML = "<i>Thứ Bảy</i>"
//     break
//   case 8:
//     document.getElementById("day").innerHTML = "<i>Chủ Nhật</i>"
//     break
//   default:
//     document.getElementById("day").innerHTML = "<i>Ngày không hợp lệ</i>"
//     break
// }

// 3.3
// let language = "JavaScript".split("")
// for (let x of language) {
//     document.getElementById("string").innerText += (" " + x)
// }

// === Phần 4 - Hàm ===
// // 4.1
// let n2 = +prompt("Nhập một số bất kỳ:")
// let tinhGiaiThua = (n) => {
//   if (n == 1) return 1
//   return tinhGiaiThua(n - 1) * n
// }

// // 4.2
// let factorial = document.getElementById("factorial")
// factorial.innerText = tinhGiaiThua(n2)
// factorial.style.color = "blue"

// let laSoChan = (n) => n % 2 == 0
// let evenNumber = document.getElementById("evenNumber")
// evenNumber.innerText = laSoChan(n2)
// evenNumber.style.color = "red"

// // 4.3
// let sayHello = (name = "bạn") => name
// let output = document.getElementById("defaultParamFunction")
// output.innerText = sayHello()
// output.style.color = "green"

// === Phần 5 - Mảng & chuỗi ===
let arr = ["HTML", "CSS", "Javascript"]

// 5.1
arr.push("React")
let output = document.getElementById("pushArray")
output.innerText = arr
output.style.color = "red"

// 5.2
let output1 = document.getElementById("length")
output1.innerText = arr.length
output1.style.color = "red"

let output2 = document.getElementById("normalWord")
for (let i = 0; i < arr.length; i++) {
  arr[i] = arr[i].toLowerCase()
}
output2.innerText = arr
output2.style.color = "red"

// 5.3
let nums = [2, 4, 6, 8]
let browse = document.getElementById("browse")
let squareNum = document.getElementById("squareNum")

for (const num of nums) {
  browse.innerHTML += `<span>  ${num}</span>`
}

nums.forEach((num) => (squareNum.innerText += `  ${num ** 2}`))

// === Phần 6 - Tương tác HTML cơ bản ===
// 1. Đổi màu nền
document.getElementById("changeColor").addEventListener("click", () => {
  const randomColor = "#" + Math.floor(Math.random() * 16777215).toString(16)
  document.body.style.backgroundColor = randomColor
})

// 2. Hiển thị chữ vừa gõ
document.getElementById("name").addEventListener("input",  (e) => {
  document.getElementById("result").textContent = e.target.value
})

// 3. Form gửi in ra console
document.getElementById("myForm").addEventListener("submit",  (e) => {
  e.preventDefault() // ngăn load lại trang
  const nameValue = document.getElementById("fullName").value
  console.log("Họ tên:", nameValue)
})