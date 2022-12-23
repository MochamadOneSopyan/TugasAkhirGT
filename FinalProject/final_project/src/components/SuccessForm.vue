<template>
  <div class="card-body border-color">
    <h5 class="card-title">Success!</h5>
    <p class="card-text">Your Data Has Been {{ judul }}!</p>
    <button @click="RefreshFunc" v-if="judul === 'Submit' " class="btn bg-color text-dark">Back</button>
    <button @click="RefreshFunc" v-else-if="judul === 'Update' " class="btn bg-color text-dark">Back</button>
    <button @click="RefreshFunc" v-else class="btn bg-color-pink text-dark">
      Refresh
    </button>
  </div>
</template>

<script>
export default {
  data(){
    return{
      judul: null,
    }
  },
  methods: {
   ubahJudul(){
    let route = this.$route.name;
    if (route === 'TambahKK' || route === 'DetailAK') {
      this.judul = "Submit";
    }else if(route === 'Homepage'){
      this.judul = "Delete";
    }else{
      this.judul = "Update";
    }
   },
   RefreshFunc(){
    location.reload();
   }
  },
  mounted(){
    this.ubahJudul();
  }
};
</script>

<style scoped>
.border-color {
  border: solid 2px rgb(35, 136, 143);
}
.bg-color {
  background-color: rgb(175, 187, 189);
}
</style>
