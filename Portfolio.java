document.querySelectorAll('.nav-link').forEach(link = {
    link.addEventListener('click' function(event) {
        event.preventDefault();
        
        // Hide all sections
        document.querySelectorAll('.content-section').forEach(section => {
            section.style.display = 'none';
        });

        // Show the clicked section
        const sectionId = this.getAttribute('data-section');
        document.getElementById(sectionId).style.display = 'block';
    });
});
