<template>
  <div class="d-flex Card">
    <div class="card bg-primary jlmh-kk mr-5">
      <div class="card-body">
        <div>
          <span>Jumlah Kartu Keluarga</span>
          <div class="img-card">
            <p><img src="@/assets/img/card-checklist.svg" alt="" />{{kkData.length}}</p>
          </div>
        </div>
      </div>
    </div>
    <div class="card bg-success jlmh-seluruh-warga">
      <div class="card-body">
        <div>
          <span>Jumlah Seluruh Warga</span>
          <div class="img-card">
            <p><img src="@/assets/img/people-fill.svg" alt="" />{{akData.length}}</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import eKtpKKService from '@/service/eKtpKKService';
export default {
  name: "cardComponent",
  data(){
    return{
      kkData: [],
      akData: [],
    };
  },
  methods: {

// METHOD GET ALL KK
   getKK() {
     eKtpKKService
       .getAll()
       .then((response) => {
         this.kkData = response.data;
         console.log(this.kkData);
       });
   },
//METHOD GET ALL ANGGOTA
   getAK() {
     eKtpKKService
       .getAllAK()
       .then((response) => {
         this.akData = response.data;
         console.log(this.akData);
       });
   },
  },
  mounted() {
   this.getKK();
   this.getAK();
  },
};
</script>

<style scoped>
.Card {
  margin-top: 80px;
  /* margin-left: 300px; */
}
.card {
  width: 40%;
}
.img-card {
  font-size: 60px;
  text-align: center;
}
img {
  width: 20%;
  margin-right: 10px;
}
.card-body {
  font-size: 30px;
}
/* .jlmh-kk {
  width: 200px;
} */
</style>
