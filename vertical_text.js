const projectBlocks = document.querySelectorAll(".project-block");
const words = ["Create", "Design", "Program"];

projectBlocks.forEach((block, i) => {
    const verticalText = block.querySelector(".vertical-text");
    const img = block.querySelector("img");

    if (words[i]) {
        verticalText.innerHTML = words[i]
            .split("")
            .map(letter => `<div>${letter}</div>`)
            .join("");
    }

    block.addEventListener("mouseenter", () => {
        const blockHeight = block.getBoundingClientRect().height;
        const textHeight = verticalText.getBoundingClientRect().height;
        const translateY = blockHeight - textHeight;

        verticalText.style.transform = `translateY(${translateY}px)`;
    });

    block.addEventListener("mouseleave", () => {
        verticalText.style.transform = `translateY(0)`;
    });
});