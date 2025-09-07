// Function to detect if the device is mobile
function isMobileDevice() {
    return /Android|iPhone|iPad|iPod|Opera Mini|IEMobile|WPDesktop/i.test(navigator.userAgent);
}

// Only run vertical text hover effect if NOT on mobile
if (!isMobileDevice()) {
    const projectBlocks = document.querySelectorAll(".project-block");
    const words = ["Creative", "Fresh", "Refined"];
    const paddingAdjustment = 2; // pixels to fix small bottom gap

    projectBlocks.forEach((block, i) => {
        const verticalText = block.querySelector(".vertical-text");
        const img = block.querySelector("img");

        // Split each word into stacked letters
        if (words[i]) {
            verticalText.innerHTML = words[i]
                .split("")
                .map(letter => `<div>${letter}</div>`)
                .join("");
        }

        // Hover effect: move text down to bottom of the block/image
        block.addEventListener("mouseenter", () => {
            const blockHeight = block.getBoundingClientRect().height;
            const textHeight = verticalText.getBoundingClientRect().height;
            const translateY = blockHeight - textHeight - paddingAdjustment;

            verticalText.style.transform = `translateY(${translateY}px)`;
        });

        // Reset position when hover ends
        block.addEventListener("mouseleave", () => {
            verticalText.style.transform = `translateY(0)`;
        });
    });
}