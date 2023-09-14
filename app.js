// Varibles {
    
var navBtn = 0, dropArrow = 0, navDropNum = 0, mobileCheck;
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

// Checks if user is on a mobile device {

function IsMobile() {

    mobileCheck = false;

    (function(a){
      if(/(android|bb\d+|meego).+mobile|avantgo|bada\/|blackberry|blazer|compal|elaine|fennec|hiptop|iemobile|ip(hone|od)|iris|kindle|lge |maemo|midp|mmp|mobile.+firefox|netfront|opera m(ob|in)i|palm( os)?|phone|p(ixi|re)\/|plucker|pocket|psp|series(4|6)0|symbian|treo|up\.(browser|link)|vodafone|wap|windows ce|xda|xiino/i.test(a)||/1207|6310|6590|3gso|4thp|50[1-6]i|770s|802s|a wa|abac|ac(er|oo|s\-)|ai(ko|rn)|al(av|ca|co)|amoi|an(ex|ny|yw)|aptu|ar(ch|go)|as(te|us)|attw|au(di|\-m|r |s )|avan|be(ck|ll|nq)|bi(lb|rd)|bl(ac|az)|br(e|v)w|bumb|bw\-(n|u)|c55\/|capi|ccwa|cdm\-|cell|chtm|cldc|cmd\-|co(mp|nd)|craw|da(it|ll|ng)|dbte|dc\-s|devi|dica|dmob|do(c|p)o|ds(12|\-d)|el(49|ai)|em(l2|ul)|er(ic|k0)|esl8|ez([4-7]0|os|wa|ze)|fetc|fly(\-|_)|g1 u|g560|gene|gf\-5|g\-mo|go(\.w|od)|gr(ad|un)|haie|hcit|hd\-(m|p|t)|hei\-|hi(pt|ta)|hp( i|ip)|hs\-c|ht(c(\-| |_|a|g|p|s|t)|tp)|hu(aw|tc)|i\-(20|go|ma)|i230|iac( |\-|\/)|ibro|idea|ig01|ikom|im1k|inno|ipaq|iris|ja(t|v)a|jbro|jemu|jigs|kddi|keji|kgt( |\/)|klon|kpt |kwc\-|kyo(c|k)|le(no|xi)|lg( g|\/(k|l|u)|50|54|\-[a-w])|libw|lynx|m1\-w|m3ga|m50\/|ma(te|ui|xo)|mc(01|21|ca)|m\-cr|me(rc|ri)|mi(o8|oa|ts)|mmef|mo(01|02|bi|de|do|t(\-| |o|v)|zz)|mt(50|p1|v )|mwbp|mywa|n10[0-2]|n20[2-3]|n30(0|2)|n50(0|2|5)|n7(0(0|1)|10)|ne((c|m)\-|on|tf|wf|wg|wt)|nok(6|i)|nzph|o2im|op(ti|wv)|oran|owg1|p800|pan(a|d|t)|pdxg|pg(13|\-([1-8]|c))|phil|pire|pl(ay|uc)|pn\-2|po(ck|rt|se)|prox|psio|pt\-g|qa\-a|qc(07|12|21|32|60|\-[2-7]|i\-)|qtek|r380|r600|raks|rim9|ro(ve|zo)|s55\/|sa(ge|ma|mm|ms|ny|va)|sc(01|h\-|oo|p\-)|sdk\/|se(c(\-|0|1)|47|mc|nd|ri)|sgh\-|shar|sie(\-|m)|sk\-0|sl(45|id)|sm(al|ar|b3|it|t5)|so(ft|ny)|sp(01|h\-|v\-|v )|sy(01|mb)|t2(18|50)|t6(00|10|18)|ta(gt|lk)|tcl\-|tdg\-|tel(i|m)|tim\-|t\-mo|to(pl|sh)|ts(70|m\-|m3|m5)|tx\-9|up(\.b|g1|si)|utst|v400|v750|veri|vi(rg|te)|vk(40|5[0-3]|\-v)|vm40|voda|vulc|vx(52|53|60|61|70|80|81|83|85|98)|w3c(\-| )|webc|whit|wi(g |nc|nw)|wmlb|wonu|x700|yas\-|your|zeto|zte\-/i.test(a.substr(0,4))) 
        mobileCheck = true;
    })(navigator.userAgent||navigator.vendor||window.opera);
    
    if (mobileCheck == true) {
        document.querySelector("head").innerHTML += "<style>/* Styles the nav button for mobile */#nav-mobil-btn {z-index: 100000;display: block;position: fixed;width: 15vw;min-width: 170px;max-width: 200px;height: 15vw;min-height: 170px;max-height: 200px;margin: 2.5vw;border-radius: 100%;background-color: rgb(0, 0, 0, 0.5);transition: .3s;}/* Changes your pointer to cursor when hovering over it */#nav-mobil-btn:hover {cursor: pointer;}#nav-mobil-btn .wrapper {display: flex;flex-direction: column;flex-wrap: wrap;width: 100%;height: 100%;border-radius: 100%;justify-content: center;align-items: center;}/* Styles the lines in the button */.line {display: block;position: relative;width: 50%;height: 5%;margin: 6%;background-color: #EEE;transition: .3s;}.toggle .one {transform: translateY(2.9vw) rotate(45deg);}.toggle .two {width: 0;opacity: 0;}.toggle .three {transform: translateY(-2.9vw) rotate(-45deg);}/* Styles the nav menu for mobile */#nav-menu {z-index: 90000;position: fixed;display: flex;flex-direction: row;flex-wrap: wrap;justify-content: center;align-items: top;width: 100vw;height: 100vh;left: -100vw;margin-top: 18vw;font-size: 6vw;background-color: black;transition: .3s;}#nav-menu .nav-wrap {display: block;width: 100%;overflow: hidden;overflow-y: scroll;}/* Styles the nav buttons the mobile nav menu */#nav-menu a {display: inline-block;-webkit-user-drag: none;text-decoration: none;color: #EEE;text-transform: uppercase;}#nav-menu a::after {display: block;content: '';width: 0;height: 2px;background: rgb(255, 255, 255);transition: .3s;}#nav-menu a:hover::after {width: 100%;}#nav-menu a:focus::after {width: 100%;}#nav-menu ul li {margin-top: 7.5vw;margin-left: 15.6vw;list-style-type: none;}#nav-menu ul ul li {margin-top: 7.5vw;}#nav-menu li:hover {cursor: pointer;}/* Styles the drop button and drop menu in the mobile nav menu */#nav-menu .drop-menu-btn {position: relative;left: -4vw;}#nav-menu .drop-menu-btn img {position: relative;left: -1.5vw;transition: .2s;}.drop-menu {height: 0;overflow: hidden;}/* Styles the icons in the mobile nav menu */#nav-menu-icons {z-index: 95000;display: flex;position: fixed;left: -100%;flex-direction: row;justify-content: left;width: 100vw;height: 19vw;background-color: black;transition: .3s;}#nav-menu-icons img {height: 10vw;}#nav-menu-icons a {width: 10%;height: 50%;border-radius: 150%;margin-top: 6vw;margin-right: 6vw;}/* Styles the website pages */.page {width: 100vw;height: 0vh;transition: 1s;}/* Styles the website page titles */.page-title {font-size: 10vw;font-family: 'ADLaM Display';text-align: center;color: #EEE;background-repeat: no-repeat;background-position: top;background-attachment: fixed;}.page-title .wrapper {display: block;width: 100%;padding-top: 24vw;padding-bottom: 24vw;background-color: rgb(0, 0, 0, 0.4);}/* Styles any main text in any website page */.page-text {width: 76vw;padding: 12vw;font: 5vw 'Amiko';text-align: center;overflow: hidden;margin-bottom: -1px;color: black;background-color: #EEE;}/* Styles any continue button */.continue-btn {display: flex;left: 0px;width: 100vw;height: 20vw;justify-content: center;align-items: center;overflow-x: hidden;background-color: #EEE;transition: .3s;}.continue-btn input {width: 50%;height: 40%;line-height: 40%;font: 4vw 'Amiko';border: none;border-radius: 2vw;overflow-x: hidden;color: #EEE;background-color: black;transition: .3s;}.continue-btn input:hover {width: 52%;height: 42%;}/* This styles the programs I knowon the about me webpage */#programs-i-know {width: 80vw;padding: 10vw;padding-bottom: 3vw;font: 5vw 'Amiko';color: #EEE;background-color: black;}#programs-i-know .item {display: flex;height: 12vw;flex-direction: row;flex-wrap: wrap;}#programs-i-know .item u {width: 100%;}#programs-i-know span {width: 50%;}#programs-i-know .left {text-align: left;}#programs-i-know .right {text-align: right;}/* Styles beginner colors */#programs-i-know .beginner {color: rgb(255, 0, 0, 0.8);text-shadow: 1px 1px 5px rgb(255, 0, 0, 0.5);text-shadow: 1px 1px 5px rgba(255, 255, 255, 0.3);}/* Styles novice colors */#programs-i-know .novice {color: rgb(255, 204, 0, 0.8);text-shadow: 1px 1px 5px rgb(255, 204, 0, 0.5);text-shadow: 1px 1px 5px rgba(255, 255, 255, 0.3);}/* Styles intermediate colors */#programs-i-know .intermediate {color: rgb(185, 255, 46, 0.8);text-shadow: 1px 1px 7px rgb(185, 255, 46, 0.5);text-shadow: 1px 1px 5px rgba(255, 255, 255, 0.3);}/* Styles advanced colors */#programs-i-know .advanced {color: rgb(24, 239, 0, 0.8);text-shadow: 1px 1px 5px rgb(24, 239, 0, 0.5);text-shadow: 1px 1px 5px rgba(255, 255, 255, 0.3);}/* This styles the block that has the button to go to my latest project on the home webpage */.latest-project {width: 80vw;font: 5vw 'Amiko';text-align: center;padding: 10vw;color: #EEE;background-color: black;}/* this styles the go to latest project button on the home webpage */.latest-project a {text-decoration: none;color: rgb(255, 0, 89);}/* This styles any extra resouces a page may have */.extra-resources {display: flex;width: 80vw;flex-direction: row;flex-wrap: wrap;padding: 10vw;padding-top: 0vw;text-align: center;font: 5vw 'Amiko';background-color: #EEE;}.extra-resources span {width: 100%;}/* This styles extra resouce links */.extra-resources a {width: 100%;margin-top: 1vw;font-size: 5vw;color: blue;}/* Styles and code snippets in the website*/.code-snippet {display: block;width: 100vw;height: auto;padding-bottom: 2vw;justify-content: center;background-color: #EEE;}pre {display: block;width: 70%;max-width: 70%;min-width: 70%;height: auto;max-height: 50vw;min-height: 4vw;resize: vertical;padding: 3vw;margin-left: 12vw;font: 3.5vw monospace;overflow: auto;border-radius: 2vw;word-wrap: break-word;color: #EEE;background: black;}pre code {user-select: all;line-height: 4.5vw;}/* Colors the comments in the code snippets */pre .comment {color: rgb(110, 110, 110);}/* Colors the variables in the code snippets */pre .light-sky-blue {color: lightskyblue;}/* Colors the variables types in the code snippets */pre .blue-1 {color: rgb(36, 171, 255);}/* Colors the numbers and letters in the code snippets */pre .light-green {color: rgb(154, 241, 158);}/* Colors the code magenta */pre .magenta {color: rgb(225, 0, 255);}pre .light-magenta {color: rgb(255, 45, 237);}/* Colors the code lime-green */pre .lime-green {color: rgb(52, 247, 182);}/* Colors the code mellow yellow */pre .mellow-yellow {color: rgb(244, 255, 148);}/*  Styles code in sentences */.snippet-code {color: #f36d33;font-family: 'Lucida Grande', monospace;background-color: #f4f4f4;}/* This styles the text on the credit's page */.credits {display: flex;width: 76vw;padding: 12vw;flex-direction: row;flex-wrap: wrap;font: 5vw 'Amiko';overflow: hidden;margin-bottom: -1px;background-color: #EEE;}.credits span {width: 100%;}.credits a {color: blue;text-decoration: none;}.credits .left {text-align: left;padding-bottom: 1vw;padding-top: 1vw;border-top: .1em solid black;color: black;}.credits .right {text-align: right;padding-bottom: 1vw;}.resources {display: flex;width: 100vw;flex-direction: column;flex-wrap: wrap;justify-content: space-evenly;align-items: center;text-align: center;font: 4.5vw 'Arial';}.resources .item {width: 65%;height: auto;padding: 8%;margin-bottom: 8vw;border-radius: 3vw;color: #EEE;background-color: rgb(27, 27, 27);}.resources a {display: block;color: #EEE;font: 5vw 'Comfortaa';margin-bottom: 4vw;}/* Typing effect */.container {display: flex;justify-content: center;align-items: center;}.page-title .container p {font-size: 3rem;padding: 0.5rem;font-weight: bold;letter-spacing: 0.1rem;text-align: center;overflow: hidden;}.page-title .container span.cursor {position: relative;display: inline-block;background-color: white;margin-left: 0.09rem;width: 3px;height: 10vw;top: 2.5vw;animation: blink 1s infinite;}.page-title .container span.cursor.typing {animation: none;}@keyframes blink {0%  { background-color: white; }49% { background-color: white; }50% { background-color: transparent; }99% { background-color: transparent; }100%  { background-color: white;}}</style>";
    }
};

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
