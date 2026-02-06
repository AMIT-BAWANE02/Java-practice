const bulb = document.getElementById('bulb');
const btn = document.getElementById('toggleBtn');
const reset = document.getElementById('resetBtn');

function setOn(on) {
    if (on) {
        bulb.classList.remove('off'); bulb.classList.add('on');
        bulb.setAttribute('aria-pressed', 'true');
        btn.textContent = 'Turn Off';
    } else {
        bulb.classList.remove('on'); bulb.classList.add('off');
        bulb.setAttribute('aria-pressed', 'false');
        btn.textContent = 'Turn On';
    }
}

function toggle() {
    const isOn = bulb.classList.contains('on');
    setOn(!isOn);
}

// Attach events
if (bulb && btn) {
    bulb.addEventListener('click', toggle);
    btn.addEventListener('click', toggle);
    reset.addEventListener('click', () => setOn(false));
}

// start with off state
setOn(false);
