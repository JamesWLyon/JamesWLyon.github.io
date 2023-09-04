// Varibles {
    
    var navBtn = false;

//}

// This makes the nav menu button on a phone move from side to side when clicked {
// This is for phones

function NavBtnMobil (w, i , item) {

    // This gets the nav menu button from the html file
    item = document.getElementById("nav-mobil-btn");
    // This gets the width of the nav menu button
    i = item.getBoundingClientRect();
    // With a little math this calculates where to perfectly position the nav menu button when you click it no matter the size of your phone
    w = (window.innerWidth - i.width) - ((window.innerWidth/100) * 2.5);

    // This is an if/else statement that changes the style of the nav menu button, as well as show and hide the actual menu 
    if (navBtn == 0) {
        navBtn = 1;
        document.getElementById("nav-mobil-btn").style.marginLeft = w + "px";
        document.getElementById("nav-mobil-btn").style.backgroundColor = "rgb(0, 0, 0, 0)";
        document.getElementById("nav-menu").style.left = "0";
        document.getElementById("nav-menu-icons").style.left = "0";
    } else {
        navBtn = 0;
        document.getElementById("nav-mobil-btn").style.marginLeft = "2.5vw";
        document.getElementById("nav-mobil-btn").style.backgroundColor = "rgb(0, 0, 0, 0.5)";
        document.getElementById("nav-menu").style.left = "-100vw";
        document.getElementById("nav-menu-icons").style.left = "-80%";
    }
    
    // This also adds a class to the wrapper div in the nav menu button
    document.getElementsByClassName("wrapper")[0].classList.toggle("toggle");
}

//}
