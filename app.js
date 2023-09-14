// Varibles {
    
var navBtn = 0, dropArrow = 0, navDropNum = 0;
var navDrop = document.getElementsByClassName("drop-menu-img");
var dropMenu = document.getElementsByClassName("drop-menu");
var grade10 = document.getElementsByClassName("grade-10");

//}

// Runs when website is loaded and resized {

function WebsiteLoad (w) {
w = window.innerHeight - ((window.innerWidth / 100) * 18);
document.getElementsByClassName("nav-wrap")[0].style.height = w + "px";

// Sets the background for all of my 10th grade pages
for (var i = 0; i < grade10.length; i++) {
    grade10[i].style.backgroundImage = "url(https://i.imgur.com/WWQUhKl.png)";
    grade10[i].style.backgroundSize = "120vw";
    grade10[i].innerHTML = "<span class='wrapper'>Week " + (i + 1) + "</span>";
}
}

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
    document.getElementById("nav-menu-icons").style.left = "-100vw";
}

// This also adds a class to the wrapper div in the nav menu button
document.getElementsByClassName("wrapper")[0].classList.toggle("toggle");
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

// Resets any drop menus
dropArrow = 1;
NavDrop(navDropNum);

// Changes the website page
var page = document.getElementsByClassName('page');
for (var i = 0; i < page.length; i++) {
    page[i].style.display = "none";
}
page[index].style.display = "block";
window.scroll(0, 0);   
}
ChangePage(0);

//}

// Gets the the amount of years I have been programming {

function GetProYears (y, item) {

// Gets the current year and finds out how many years it has been since 2018
y = (new Date().getFullYear()) - 2018;
// Gets the items we add this information to
item = document.getElementsByClassName("programming-years");

// Adds y to the items
for (var i = 0; i < item.length; i++) {
    item[i].textContent = y;
}
}

//}

// This adds colors and adds the code snippets in the website {

function WriteCodeSnips () {

    var snips = [
        '😀// Byte can store whole numbers between -128 and 127😀\n😇byte😇 😄myAge😄 = 😝16😝;\n😀// Short can store whole numbers between -32768 and 32767😀\n😇Short😇 😄shoeSize😄 = 😝-23754😝;\n😀// Int can store whole numbers between -2147483648 and 2147483647😀\n😇int😇 😄amountPeople😄 = 😝93564789😝;\n😀// Long can store whole numbers between -9223372036854775808 and 9223372036854775807😀\n😇long😇 😄money😄 = 😝8374736746344393😝;\n😀// Float can store fractional numbers, is great for storing numbers to the 6th or 7th decimal point😀\n😇float😇 😄timer😄 = 😝5.637348😝;\n😀// Double can store fractional numbers, is great for storing numbers to the 15th decimal point😀\n😇double😇 😄score😄 = 😝183.38473883734292😝;\n😀// Boolean stores a true or false value😀\n😇boolean😇 😄alive😄 = 😇false😇;\n😀// Char stores a single character/letter or ASCII values😀\n😇char😇 😄myLetter😄 = 😝"L"😝;',
        '😀/* This is the if statement, everything in the () is the conditions to make this if statement work.\nThere can be more than one condition, just add && to say and, or || to say or. */😀\n🥰if🥰 🥹(🥹😄i😄 == 😝5😝🥹) {🥹\n🤩😊System😊.😄out😄.😗println😗🥹(🥹😝"Hello world"😝🥹)🥹;\n🥹}🥹\n\n😀// This is an if statemnt with more than one condition😀\n🥰if🥰 🥹(🥹😄x😄 == 😝22😝 && 😄y😄 == 😝10😝 || 😄v😄 == 😝3😝🥹) {🥹\n🤩😊System😊.😄out😄.😗println😗🥹(🥹😝"Goodbye earth"😝🥹)🥹;\n🥹}🥹',
        '😀/* This is a demonstration of an if/else statement\nIt also has an else if as well */😀\n\n😀// This is the variable, it is a random number😀\n😇double😇 😄num😄 = 😊Math😊.floor🥹(🥹😊Math😊.😗random😗😄()😄 * 😄(😄😝10😝 - 😝1😝 + 😝1😝😄)😄 + 😝1😝🥹)🥹;\n\n😀// This will run if its condition is met😀\n🥰if🥰 🥹(🥹😄num😄 <= 😝5😝🥹) {🥹\n🤩😊System😊.😄out😄.😗println😗🥹(🥹"little numbers"🥹)🥹;\n🥹}🥹\n😀// This will run if its condition is met and the code above did not run😀\n🥰else if🥰 🥹(🥹😄num😄 == 😝10😝🥹) {🥹\n🤩😊System😊.😄out😄.😗println😗🥹(🥹"huge number"🥹)🥹;\n🥹}🥹\n😀// This will run if the code above it does not run😀\n\n🥰else🥰 🥹{🥹\n🤩😊System😊.😄out😄.😗println😗🥹(🥹"big numbers"🥹)🥹;\n🥹}🥹',
        '😀// Format them with a comma at the end😀\n😄if😄 😇(😇up😇)😇, 😗go_down😗😇()😇,\n😄if😄 😇(😇down😇)😇, 😗go_up😗😇()😇,\n\n😀// It can also be written this way😀\n😇direction😇 == up, 😗go_down😗😇()😇,\n😇direction😇 == down, 😗go_up😗😇()😇,',
        '😀// This for loop will run and print what number it~s on till it reaches 10😀\n🥰for🥰 🥹(🥹😇var😇 😄i😄 = 😝0😝; 😄i😄 <= 😝10😝; 😄i😄++🥹) {🥹\n🤩😊System😊.😄out😄.😗println😗🥹(🥹😄i😄🥹)🥹;\n🥹}🥹\n\n😀/* This while loop will run and print what number it~s on till it reaches 0\nThis variable is its number */😀\n😇byte😇 😄x😄 = 😝10😝;\n\n🥰while🥰 🥹(🥹😄x😄 >= 😝0😝🥹) {🥹\n🤩😊System😊.😄out😄.😗println😗🥹(🥹😄x😄🥹)🥹;\n🤩😄x😄--;\n🥹}🥹',
        '😊int😊😇[]😇 😄myArray😄 = 🥰new🥰 😊int😊😇[😇😝10😝😇]😇;',
        '😊Sting😊😇[]😇 😄words😄 = 😇{\n😇🤩😀// This is the first thing in the array so it~s number is 0😀\n🤩😝"hi"😝,\n🤩😀// This is the second thing in the array so it~s number is 1😀\n🤩😝"hello"😝,\n🤩😀// This is the third thing in the array so it~s number is 2😀\n🤩😝"goodbye"😝\n};',
    ];
    var snip = document.getElementsByClassName("code");

    for (var i = 0; i < snips.length; i ++) {
        snips[i] = CleanseText(snips[i]);
        snip[i].innerHTML = snips[i];
    }
}

function CleanseText (Text) {

    Text = Text.replace(/</g, "&lt");
    // For tab
    Text = Text.replace(/🤩/g, "    ");
    // For '
    Text = Text.replace(/~/g, "'");
    // 😀 = comment
    Text = Text.replace(/\😀([^\😀]+)\😀/g, "<span class='comment'>$1</span>");
    // 😇 = blue-1
    Text = Text.replace(/\😇([^\😇]+)\😇/g, "<span class='blue-1'>$1</span>");
    // 😄 = light sky blue
    Text = Text.replace(/\😄([^\😄]+)\😄/g, "<span class='light-sky-blue'>$1</span>");
    // 🥹 = magenta
    Text = Text.replace(/\🥹([^\🥹]+)\🥹/g, "<span class='magenta'>$1</span>");
    // 🥰 = light magenta
    Text = Text.replace(/\🥰([^\🥰]+)\🥰/g, "<span class='light-magenta'>$1</span>");
    // 😊 = lime green
    Text = Text.replace(/\😊([^\😊]+)\😊/g, "<span class='lime-green'>$1</span>");
    // 😝 = light green
    Text = Text.replace(/\😝([^\😝]+)\😝/g, "<span class='light-green'>$1</span>");
    // 😗 = mellow yellow
    Text = Text.replace(/\😗([^\😗]+)\😗/g, "<span class='mellow-yellow'>$1</span>");

    return Text;
}

WriteCodeSnips();

//}

// The typewriter effect {
const typedTextSpan = document.querySelector(".typed-text");
const cursorSpan = document.querySelector(".cursor");

const textArray = ["Journey", "Adventure", "Expidition", "Voyage"];
const typingDelay = 200;
const erasingDelay = 100;
const newTextDelay = 2000; // Delay between current and next text
let textArrayIndex = 0;
let charIndex = 0;

function type() {
    if (charIndex < textArray[textArrayIndex].length) {
    if(!cursorSpan.classList.contains("typing")) cursorSpan.classList.add("typing");
    typedTextSpan.textContent += textArray[textArrayIndex].charAt(charIndex);
    charIndex++;
    setTimeout(type, typingDelay);
    } 
    else {
    cursorSpan.classList.remove("typing");
    setTimeout(erase, newTextDelay);
    }
}

function erase() {
    if (charIndex > 0) {
    if(!cursorSpan.classList.contains("typing")) cursorSpan.classList.add("typing");
    typedTextSpan.textContent = textArray[textArrayIndex].substring(0, charIndex-1);
    charIndex--;
    setTimeout(erase, erasingDelay);
    } 
    else {
    cursorSpan.classList.remove("typing");
    textArrayIndex++;
    if(textArrayIndex>=textArray.length) textArrayIndex=0;
    setTimeout(type, typingDelay + 1100);
    }
}

document.addEventListener("DOMContentLoaded", function() { // On DOM Load initiate the effect
    if(textArray.length) setTimeout(type, newTextDelay + 250);
});
//}
