<template>
  <div class="form">
    <h1 class="my-5">Detail Anggota Keluarga</h1>
    <button type="button" class="btn btn-primary m-3" @click="back" v-show="!success">Back</button>
    <router-link :to="`/detailKK/${id}/listAnggota/detailAnggota/${id_anggota}`">
      <button
        type="button"
        class="btn btn-primary m-3"
        @click="modeEdit"
        v-if="isDisable"
      >
        Update Anggota
      </button>
    </router-link>
    <div class="d-flex justify-content-cemter my-5">
      <div class="col-md-10">
        <form
          action=""
          style="border: 3px solid blue"
          @submit.prevent="updateAK"
          v-show="!success"
          
        >
          <div class="d-flex">
            <div class="col-md-6 p-3">
              <div class="col-auto d-flex justify-content-between my-3">
                <label for="name">NIK</label>
                <input
                  class="form-control"
                  type="number"
                  placeholder="NIK"
                  style="width: 50%"
                  v-model="akData.nik"
                  :disabled="isDisable"
                />
              </div>
              <div class="col-auto d-flex justify-content-between my-3">
                <label for="name">Nama</label>
                <input
                  class="form-control"
                  type="text"
                  placeholder="Nama Lengkap"
                  style="width: 50%"
                  v-model="akData.nama"
                  :disabled="isDisable"
                />
              </div>
              <div class="col-auto d-flex justify-content-between my-3">
                <label for="name">Jenis Kelamin</label>
                <select
                  class="custom-select"
                  id="inputGroupSelect01"
                  v-model="akData.jenis_kelamin"
                  :disabled="isDisable"
                >
                  <option selected></option>
                  <option value="Laki-laki">Laki-laki</option>
                  <option value="Perempuan">Perempuan</option>
                </select>
              </div>
              <div class="col-auto d-flex justify-content-between my-3">
                <label for="name">Tempat Lahir</label>
                <input
                  class="form-control"
                  type="text"
                  placeholder="Tempat Lahir"
                  style="width: 50%"
                  v-model="akData.tempat_lahir"
                  :disabled="isDisable"
                />
              </div>
              <button type="submit" class="btn btn-primary"  v-if="!isDisable">
                Update
              </button>
              
              <button type="button" class="btn btn-primary m-3" @click="modeEdit"   v-if="!isDisable">Batal</button>
            </div>
            <div class="col-md-6 p-3">
              <div class="col-auto d-flex justify-content-between my-3">
                <label for="name">Tanggal Lahir</label>
                <input
                  class="form-control"
                  type="Date"
                  style="width: 50%"
                  v-model="akData.tanggal_lahir"
                  :disabled="isDisable"
                />
              </div>
              <div class="col-auto d-flex justify-content-between my-3">
                <label for="name">Agama</label>
                <input
                  class="form-control"
                  type="text"
                  placeholder="Agama"
                  style="width: 50%"
                  v-model="akData.agama"
                  :disabled="isDisable"
                />
              </div>
              <div class="col-auto d-flex justify-content-between my-3">
                <label for="name">Pendidikan</label>
                <input
                  class="form-control"
                  type="text"
                  placeholder="Pendidikan Terakhir"
                  style="width: 50%"
                  v-model="akData.pendidikan"
                  :disabled="isDisable"
                />
              </div>
              <div class="col-auto d-flex justify-content-between my-3">
                <label for="name">Kepala Keluarga</label>
                <select
                  class="custom-select"
                  id="inputGroupSelect01"
                  v-model="akData.kepala_keluarga"
                  :disabled="isDisable"
                >
                  <option selected></option>
                  <option value="YES">YES</option>
                  <option value="NO">NO</option>
                </select>
              </div>
            </div>
          </div>
        </form>
        <!-- Success Section -->
        <SuccessFormVue v-show="success"></SuccessFormVue>
      </div>
    </div>
  </div>
</template>

<script>
import eKtpKKService from "@/service/eKtpKKService";
import SuccessFormVue from "./SuccessForm.vue";
export default {
  name: "formDetailAKPage",
  components: {
    SuccessFormVue,
  },
  data() {
    return {
      akData: {
        nik: null,
        nama: null,
        id_kk: null,
        jenis_kelamin: null,
        tempat_lahir: null,
        tanggal_lahir: null,
        agama: null,
        pendidikan: null,
        kepala_keluarga: null,
      },
      success: false,
      isDisable: true,
      id: this.$route.params.id,
      id_anggota: this.$route.params.id_anggota
    };
  },
  methods: {
    insertAK() {
      let data = this.akData;
      eKtpKKService
        .createAK(data)
        .then((response) => {
          console.log(response.data);
          this.success = true;
        })
        .catch((e) => {
          console.log(e);
        });
    },
    getAK() {
      let id = this.$route.params.id_anggota;
      eKtpKKService
        .getAK(id)
        .then((response) => {
          this.akData = response.data;
          console.log(this.akData);
        })
        .catch((e) => {
          console.log(e);
        });
    },
    updateAK() {
      this.akData.id_kk = this.$route.params.id
      let data = this.akData;
      let id = this.$route.params.id_anggota;
      eKtpKKService
        .updateAK(id, data)
        .then((response) => {
          this.akData = response.data;
          console.log(this.akData);
          this.success = true;
        })
        .catch((e) => {
          console.log(e);
        });
    },
    modeEdit() {
      this.isDisable = !this.isDisable;
    },
    back(){
      window.history.back();
    },
    // batal(){
    //   window.history.batal();
    // },
    reload(){
      this.location.reload();
    }
  },
  mounted() {
    this.getAK();
  },
};
</script>

<style></style>
