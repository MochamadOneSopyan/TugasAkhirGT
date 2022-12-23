<template>
  <div class="tableKK">
    <h1 class="text-center my-5">Data Kartu Keluarga</h1>
    <table class="table table-striped" v-show="!success">
      <thead>
        <tr>
          <th scope="col">No.</th>
          <th scope="col">Nomor KK</th>
          <th scope="col">Alamat</th>
          <th scope="col">Kota</th>
          <th scope="col">Kode Pos</th>
          <th scope="col">Action</th>
        </tr>
      </thead>
      <tbody >
        <tr v-for="(item, index) in kkData" :key="index">
          <th>{{ index + 1 }}</th>
          <td>{{ item.nomor_kk }}</td>
          <td>{{ item.alamat }}</td>
          <td>{{ item.kabupaten_kota }}</td>
          <td>{{ item.kode_pos }}</td>
          <td class="d-flex">
            <router-link :to="{ path: '/detailKK/' + item.id }">
              <button class="btn btn-sm btn-primary mr-2 text-white">
                Detail
              </button>
            </router-link>
            <button
              type="submit"
              class="btn btn-sm btn-danger mr-2"
              @click.prevent="deletekartuKeluarga(item.id)"
            >
              Delete
            </button>
          </td>
        </tr>
      </tbody>
    </table>
    <SuccessFormVue v-show="success"></SuccessFormVue>
  </div>
</template>

<script>
import eKtpKKService from "@/service/eKtpKKService";
import SuccessFormVue from "./SuccessForm.vue";
export default {
  name: "tableDataKK",
  components: {
    SuccessFormVue,
  },
  data() {
  return {
    kkData: null,
    success: false,
    // textAlert: '',
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
        })
        .catch((e) => {
          console.log(e);
        });
    },
//  //METHOD GET ALL ANGGOTA
//     getAK() {
//       eKtpKKService
//         .getAllAK()
//         .then((response) => {
//           this.akData = response.data;
//           console.log(this.akData);
//         })
//         .catch((e) => {
//           console.log(e);
//         });
//     },

    deletekartuKeluarga(id) {
      if (confirm("Apakah ingin menghapus data ini")) {
        eKtpKKService
          .deleteKK(id)
          .then((response) => {
            console.log(response.data);
            this.success = true;
          })
          .catch((e) => {
            console.log(e);
          });
      } else {
        alert("Hapus Dibatalkan");
      }
    },
  },
  mounted() {
    this.getKK();
  },
};
</script>

<style scoped>
/* .tableKK {
  margin-left: 300px;
} */
</style>
