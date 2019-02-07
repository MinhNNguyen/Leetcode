// Add your javascript here

var selected;
var colorStored;
var mapName = new Map();
var mapDetail = new Map();

function changeColor() {
    const prodName = document.getElementById('prod-name');
    const prodDetail = document.getElementById('prod-detail');
    prodName.style.backgroundColor = getComputedStyle(event.target).backgroundColor;
    prodDetail.style.backgroundColor = getComputedStyle(event.target).backgroundColor;
}

function addProduct() {
    const name = document.getElementById('prod-name').value;
    const detail = document.getElementById('prod-detail').value;
    const color = getComputedStyle(document.getElementById('prod-name')).backgroundColor;
    if (name == '') {
        const err = document.getElementById('errorMessage');
        err.style.display = "block";
    }
    else {
        const prodList = document.getElementById('product-list');
        const newProduct = document.createElement('article');
        const para1 = document.createElement('p');
        const dateNode = document.createTextNode(new Date().toLocaleDateString());
        para1.appendChild(dateNode);
        const para2 = document.createElement('p');
        const nameNode = document.createTextNode(name);
        para2.appendChild(nameNode);
        newProduct.appendChild(para1);
        newProduct.appendChild(para2);
        newProduct.style.backgroundColor = color;
        newProduct.classList.add("product-item");
        prodList.appendChild(newProduct);
        newProduct.onclick = function(){
            unSelect();
            selected = newProduct;
            colorStored = getComputedStyle(newProduct).backgroundColor;
            newProduct.style.backgroundColor = '#F2F2F2';
            const prodName = document.getElementById('prod-name');
            const prodDetail = document.getElementById('prod-detail');
            prodName.value = mapName.get(newProduct);
            prodDetail.value = mapDetail.get(newProduct);
            prodName.style.backgroundColor = colorStored;
            prodDetail.style.backgroundColor = colorStored;
        };
        mapName.set(newProduct, name);
        mapDetail.set(newProduct, detail);
    }
}

function clearSelect() {
    unSelect();
}

function removeSelected() {
    const prodName = document.getElementById('prod-name');
    const prodDetail = document.getElementById('prod-detail');
    const prodList = document.getElementById('product-list');
    //mapName.delete(selected);
    //mapDetail.delete(selected);
    prodList.removeChild(selected);
    selected = null;
    colorStored = null;
    prodName.value= '';
    prodDetail.value = '';
    prodName.style.backgroundColor = 'white';
    prodDetail.style.backgroundColor = 'white';
}

function unSelect() {
    const prodName = document.getElementById('prod-name');
    const prodDetail = document.getElementById('prod-detail');
    if (selected != null) {
        selected.style.backgroundColor = colorStored;
    }
    selected = null;
    colorStored = null;
    prodName.value= '';
    prodDetail.value = '';
    prodName.style.backgroundColor = 'white';
    prodDetail.style.backgroundColor = 'white';
}

function removeError() {
    const err = document.getElementById('errorMessage');
    err.style.display = "none"
}
