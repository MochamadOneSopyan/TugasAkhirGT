<template>
  <div>
    <nav>
        <!-- <h2 style="text-align: center">E-KTP APP</h2> -->
        <ul>
            <li class="logo"><img src="@/assets/img/ktp.png" style="width:150px"></li>
            <router-link to="/home">
                <li><a href="#"><i class="fa fa-home"></i>&nbsp; Home</a></li>
            </router-link>
         
            <router-link to="/addKK">
                <li><a href="#"><i class="fa fa-book"></i>&nbsp; Tambah KK</a></li>
            </router-link>
            <br>
            <router-link to="/">
            <li><a href="#"><i class="fa fa-picture-o"></i>&nbsp; Sign Out</a></li>
            </router-link>
           
        </ul>
    </nav>
    
    <!-- <div class="wrapper">
        <div class="section">
            <div class="box-area">
                <h2>Home Page</h2>
            </div>
            
        </div>
    </div> -->
</div>
   <!-- <div>
    <nav>
        <h2 style="text-align: center">E-KTP APP</h2>
        <ul>
            <li class="logo"><img src="@/assets/img/ktp.png" style="width:150px"></li>
            <router-link to="/home">
                <li><a href="#"><i class="fa fa-home"></i>&nbsp; Home</a></li>
            </router-link>
            <router-link to="/addKK">
                <li><a href="#"><i class="fa fa-book"></i>&nbsp; Tambah KK</a></li>
            </router-link>
            <br>
            <router-link to="/">
            <li><a href="#"><i class="fa fa-picture-o"></i>&nbsp; Sign Out</a></li>
            </router-link>
           
        </ul>
    </nav>
    
    <div class="wrapper">
        <div class="section">
            <div class="box-area">
                <h2>Home Page</h2>
            </div>
            
        </div>
    </div>
</div> -->
  <!-- Sidebar -->
  <!-- <nav id="sidebarMenu" class="collapse d-lg-block sidebar collapse bg-white">
    <div class="list-group list-group-flush mx-3 mt-4">
      <h2 style="text-align: center">E-KTP APP</h2>
      <br />
      <router-link
        to="/home"
        href="#"
        class="list-group-item list-group-item-action py-2 ripple"
        ><img src="@/assets/img/houses-fill.svg" alt="" />
        <span>Home</span>
      </router-link>
      <router-link
        to="/addKK"
        href="#"
        class="list-group-item list-group-item-action py-2 ripple"
        ><img src="@/assets/img/file-earmark-plus-fill.svg" alt="" /><span
          >Tambah KK</span
        ></router-link
      >
      <router-link
        to="/"
        href="#"
        class="list-group-item list-group-item-action py-2 ripple"
        ><img src="@/assets/img/lock-fill.svg" alt="" /><span
          >Sign Out</span
        ></router-link
      >
    </div> -->
    <!-- <div class="position-sticky">
    </div> -->
  
  <!-- Sidebar -->
</template>

<script>
export default {
  name: "sideBar",
};
</script>

<style scoped>
/* Sidebar */body{
    margin:0;
    padding:0;
    font-family:'montserrat';
    background:#7f67b4;
}

.logo{
    padding:20px;
}

nav ul{
    margin:0;
    padding:0;
    height:100%;
    width:260px;
    position:fixed;
    top:0;
    left:0;
    background-color:#2c225f;
}

nav ul li{
    list-style:none;
}


nav ul li a{
    display:block;
    font-family:'montserrat';
    text-decoration:none;
    text-transform:uppercase;
    font-size:17px;
    color:rgb(255, 255, 255);
    position:relative;
    padding:15px 0px 15px 25px;
    transition:all 0.5s;
}

nav ul li a:before{
    content:'';
    position:absolute;
    top:0;
    right:0;
    height:100%;
    background:#1d3e8a;
    border-radius:40px 0 0 40px;
    z-index:-1;
    transition:all 1s;
}

nav ul li a:hover{
    color:#e9e0e0;
}

nav ul li a:hover:before{
    width:95%;
}


.wrapper{
    margin-left:260px;
}

.section{
    display:grid;
    place-items:center;
 
    text-align:center;
}

.box-area h2{
    text-transform:uppercase;
    font-size:30px;
}  

/* @media (max-width: 991.98px) {
  .sidebar {
    width: 100%;
  }
} */
/* .sidebar .active {
  border-radius: 5px;
  box-shadow: 0 2px 5px 0 rgb(0 0 0 / 16%), 0 2px 10px 0 rgb(0 0 0 / 12%);
} */
</style>
