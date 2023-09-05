// Varibles {
    
    var navBtn = 0, dropArrow = 0, navDropNum = 0;
    var navDrop = document.getElementsByClassName("drop-menu-img");
    var dropMenu = document.getElementsByClassName("drop-menu");

//}

// Runs when website is loaded and resized {

function WebsiteLoad (w) {
    w = window.innerHeight - ((window.innerWidth / 100) * 18);
    document.getElementsByClassName("nav-wrap")[0].style.height = w + "px";
}

//}

// This makes the nav menu button on a phone move from side to side when clicked {
// This is for phones

function NavBtnMobil (clik, w, i , item) {

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
        document.getElementById("nav-menu-icons").style.left = "-100vw";
    }
    
    // This also adds a class to the wrapper div in the nav menu button
    if (clik == 0) {
        document.getElementsByClassName("wrapper")[0].classList.toggle("toggle");
    }
}

//}

// This makes the drop menus in the nav menu work {

function NavDrop (i, itm) {

    // Sets the navDropNum variable to whatever the correct arrow number is
    navDropNum = i;
    // This sets the varible item to the class of that specific arrow
    let item = navDrop[i];
    // This gets the actual drop menu part
    itm = dropMenu[i];
    
    if (dropArrow == 0) {
        dropArrow = 1;
        item.style.transform = "rotate(90deg)";
        itm.style.height = "100%";
    } else {
        dropArrow = 0;
        item.style.transform = "rotate(-0deg)";
        itm.style.height = "0";
    }
}

//}

// Changes the website pages {
    
function ChangePage (index) {

    // Closes the nav menu
    navBtn = 1;
    NavBtnMobil();

    // Resets any drop menus
    dropArrow = 1;
    NavDrop(navDropNum);

    // Changes the website page
    var page = document.getElementsByClassName('page');
    for (var i = 0; i < page.length; i++) {
        page[i].style.display = 'none';
    }
    page[index].style.display = 'block';
    window.scroll(0, 0);   
}
ChangePage(0);

//}

// Gets the the amount of years I have been programming {

function GetProYears (i) {

    i = new Date().getFullYear();
    document.getElementById("programming-years").textContent = i - 2018;
}

//}
