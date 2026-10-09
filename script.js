document.addEventListener("DOMContentLoaded", function () {
    const menuIcon = document.querySelector(".menu-icon");
    const navLinks = document.querySelector(".nav-links");

    menuIcon.addEventListener("click", function () {
        const isOpen = navLinks.classList.toggle("active");
        menuIcon.setAttribute("aria-expanded", isOpen);
        menuIcon.setAttribute("aria-label", isOpen ? "Đóng menu" : "Mở menu");
    });

    // Đóng menu sau khi chọn một liên kết trên màn hình mobile.
    navLinks.querySelectorAll("a").forEach(function (link) {
        link.addEventListener("click", function () {
            navLinks.classList.remove("active");
            menuIcon.setAttribute("aria-expanded", "false");
            menuIcon.setAttribute("aria-label", "Mở menu");
        });
    });
});
