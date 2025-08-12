const studentInput = document.getElementById("studentName")
const searchInput = document.getElementById("searchName")
const studentList = document.getElementById("studentList")
const notFound = document.getElementById("notFound")
const total = document.getElementById("total")
const addButton = document.getElementById("addBtn")
const sortButton = document.getElementById("sortBtn")
let count = 0

// Chức năng thêm sinh viên
addButton.addEventListener("click", () => {
  const name = studentInput.value.trim()

  if (!name) {
    notFound.innerText = "Vui lòng không để trống!"
    return
  }
  notFound.innerText = ""

  // Tạo HTML của li
  const liHTML = 
  `
    <li>
      <span class="name">${name}</span>
      <div class="actions">
        <span class="pill"><i class='bx bx-user'></i></span>
        <button class="editBtn">Sửa</button>
        <button class="deleteBtn">Xóa</button>
      </div>
    </li>
  `

  // Thêm vào danh sách
  studentList.insertAdjacentHTML("beforeend", liHTML)
  updateTotalChars()

  const newLi = studentList.lastElementChild
  const nameSpan = newLi.querySelector(".name")
  const deleteBtn = newLi.querySelector(".deleteBtn")
  const editBtn = newLi.querySelector(".editBtn")

  // Xóa sinh viên
  deleteBtn.addEventListener("click", () => {
    if (confirm("Bạn có chắc muốn xóa?")) {
      newLi.remove()
      total.innerText = --count
      updateTotalChars()
    }
  })

  // Sửa tên sinh viên trực tiếp
  editBtn.addEventListener("click", () => {
    const currentName = nameSpan.textContent

    const input = document.createElement("input")
    input.type = "text"
    input.value = currentName
    input.className = "editInput"

    // Thay span bằng input
    newLi.replaceChild(input, nameSpan)
    input.focus()

    const saveName = () => {
      const newName = input.value.trim() || currentName
      nameSpan.textContent = newName
      newLi.replaceChild(nameSpan, input)
      updateTotalChars()
    }
    // console.log("saveName", saveName());
    input.addEventListener("blur", saveName)
    input.addEventListener("keydown", (e) => {
      if (e.key === "Enter") saveName()
    })
  })

  total.innerText = ++count
  studentInput.value = ""
})

// Chức năng tìm kiếm
searchInput.addEventListener("input", () => {
  const searchName = searchInput.value.trim().toLowerCase()
  const items = studentList.querySelectorAll("li")
  let found = false

  // Nếu ô tìm kiếm trống
  if (!searchName) {
    items.forEach(li => {
      const nameSpan = li.querySelector(".name")
      nameSpan.innerHTML = nameSpan.textContent // bỏ highlight
      li.style.display = "" // hiện tất cả
    })
    notFound.textContent = "" // xóa thông báo
    return // thoát luôn
  }

  // Có từ khóa tìm kiếm
  items.forEach(li => {
    const nameSpan = li.querySelector(".name")
    const name = nameSpan.textContent.toLowerCase()
    nameSpan.innerHTML = nameSpan.textContent // bỏ highlight cũ

    if (name.includes(searchName)) {
      li.style.display = ""
      found = true
      // tô màu phần khớp
      const regex = new RegExp(`(${searchName})`, "gi")
      nameSpan.innerHTML = nameSpan.textContent.replace(regex, "<mark>$1</mark>")
    } else {
      li.style.display = "none"
    }
  })

  // Hiện thông báo nếu không tìm thấy
  notFound.textContent = found ? "" : "Không tìm thấy"
})

// Chức năng sắp xếp
sortButton.addEventListener("click", () => {
  const items = Array.from(studentList.querySelectorAll("li"))

  items.sort((a, b) =>
    a.textContent.localeCompare(b.textContent, "vi", { sensitivity: "case" })
  )

  items.forEach((item) => studentList.appendChild(item))
})

// Nút đổi màu nền
document.querySelector(".btnBlue").addEventListener("click", () => {
  studentList.style.backgroundColor = "lightblue"
})

document.querySelector(".btnYellow").addEventListener("click", () => {
  studentList.style.backgroundColor = "lightyellow"
})

document.querySelector(".btnWhite").addEventListener("click", () => {
  studentList.style.backgroundColor = "white"
})

const updateTotalChars = () => {
  const names = studentList.querySelectorAll(".name")
  let totalChars = 0
  names.forEach((nameSpan) => {
    totalChars += nameSpan.textContent.length
  })
  document.getElementById("totalChars").textContent = totalChars
}