const container = document.querySelector('.tilt-container');
const image = container.querySelector('img');
const tiltEffect = 14;

let isHovering = false;

container.addEventListener('mouseenter', () => {
    isHovering = true;
});

container.addEventListener('mousemove', (e) => {
    if (!isHovering) return;

    const rect = container.getBoundingClientRect();
    const x = e.clientX - rect.left;
    const y = e.clientY - rect.top;

    const centerX = rect.width / 2;
    const centerY = rect.height / 2;

    const rotateX = ((y - centerY) / centerY) * -tiltEffect;
    const rotateY = ((x - centerX) / centerX) * tiltEffect;

    window.requestAnimationFrame(() => {
        image.style.transform = `rotateX(${rotateX}deg) rotateY(${rotateY}deg)`;
    });
});

container.addEventListener('mouseleave', () => {
    isHovering = false;
    image.style.transform = 'rotateX(0deg) rotateY(0deg)';
});
