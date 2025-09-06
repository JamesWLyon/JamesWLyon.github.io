const container = document.querySelector('.tilt-container');
const image = container.querySelector('img');
const tiltEffect = 14;

container.addEventListener('mousemove', (e) => {
    // Get position of mouse relative to the container
    const rect = container.getBoundingClientRect();
    const x = e.clientX - rect.left; // x position within container
    const y = e.clientY - rect.top;  // y position within container

    // Calculate center
    const centerX = rect.width / 2;
    const centerY = rect.height / 2;

    // Calculate rotation values, max 15 degrees tilt
    const rotateX = ((y - centerY) / centerY) * -tiltEffect; // invert rotation for natural feel
    const rotateY = ((x - centerX) / centerX) * tiltEffect;

    // Apply transform
    image.style.transform = `rotateX(${rotateX}deg) rotateY(${rotateY}deg)`;
});

container.addEventListener('mouseleave', () => {
    // Reset transform when mouse leaves container
    image.style.transform = 'rotateX(0deg) rotateY(0deg)';
});