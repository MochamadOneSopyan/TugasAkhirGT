<template>
  <div class="">
    <!-- Table Anggota keluarga -->
    <div class="tableAK" v-show="isDisabled">
      <h1 class="text-center my-5">Daftar Anggota Keluarga</h1>
      <router-link to="/home">
        <button type="button" class="btn btn-primary m-3">Back</button>
      </router-link>
      <button type="button" class="btn btn-primary m-3" @click="tambahAKFunc">
        Tambah Anggota Keluarga
      </button>
      <!-- <router-link :to="`/detailKK/${id}/listAnggota`">
      </router-link> -->
      <table class="table table-striped" v-show="!success">
        <thead>
          <tr>
            <th scope="col">No.</th>
            <th scope="col">NIK</th>
            <th scope="col">NAMA</th>
            <th scope="col">Jenis Kelamin</th>
            <th scope="col">Kepala Keluarga</th>
            <th scope="col">Action</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="(item, index) in aKDataTable" :key="item.id">
            <th>{{ index + 1 }}</th>
            <td>{{ item.nik }}</td>
            <td>{{ item.nama }}</td>
            <td>{{ item.jenis_kelamin }}</td>
            <td>{{ item.kepala_keluarga }}</td>
            <td class="d-flex">
              <router-link :to="`/detailKK/${$route.params.id}/listAnggota/detailAnggota/${item.id}`">
                <button class="btn btn-sm btn-primary mr-2 text-white">
                  Detail
                </button>
              </router-link>
              <button
                type="submit"
                class="btn btn-sm btn-danger mr-2"
                @click.prevent="deleteAnggotaKeluarga(item.id)"
              >
                Delete
              </button>
            </td>
          </tr>
        </tbody>
      </table>
      <SuccessFormVue v-show="success"></SuccessFormVue>
    </div>

    <!-- Form Tambah Anggota Keluarga -->
    <div class="form" v-show="!isDisabled">
      <h1 class="my-5">Tambah Anggota</h1>
      <router-link to="/home">
        <button type="button" class="btn btn-primary m-3">Back</button>
      </router-link>
      <div class="d-flex justify-content-cemter my-5">
        <div class="col-md-10">
          <form
            action=""
            style="border: 3px solid blue"
            @submit.prevent="insertAK"
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
                    required
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
                    required
                  />
                </div>
                <div class="col-auto d-flex justify-content-between my-3">
                  <label for="name">Jenis Kelamin</label>
                  <select
                    class="custom-select"
                    id="inputGroupSelect01"
                    v-model="akData.jenis_kelamin"
                    required
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
                    required
                  />
                </div>
                <button type="submit" class="btn btn-primary" @click="addIdAK">
                  Submit
                </button>
              </div>
              <div class="col-md-6 p-3">
                <div class="col-auto d-flex justify-content-between my-3">
                  <label for="name">Tanggal Lahir</label>
                  <input
                    class="form-control"
                    type="Date"
                    style="width: 50%"
                    v-model="akData.tanggal_lahir"
                    required
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
                    required
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
                    required
                  />
                </div>
                <div class="col-auto d-flex justify-content-between my-3">
                  <label for="name">Kepala Keluarga</label>
                  <select
                    class="custom-select"
                    id="inputGroupSelect01"
                    v-model="akData.kepala_keluarga"
                    required
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
  </div>
</template>

<script>
import eKtpKKService from "@/service/eKtpKKService";
import SuccessFormVue from "./SuccessForm.vue";
export default {
  name: "tableDataAk",
  components: {
    SuccessFormVue,
  },
  methods: {
    getAK() {
      eKtpKKService
        .getAllAK()
        .then((response) => {
          this.aKDataTable = response.data;
          console.log(this.aKDataTable);
        })
        .catch((e) => {
          console.log(e);
        });
    },
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
    
    deleteAnggotaKeluarga(id) {
      if (confirm("Apakah ingin menghapus data ini")) {
        eKtpKKService
          .deleteAK(id)
          .then((response) => {
            console.log(response.data);
            this.success = true;
          })
          .catch((e) => {
            console.log(e);
          });
      } else {
        alert("Hapus dibatalkan");
      }
    },
    tambahAKFunc() {
      this.isDisabled = false;
    },
    addIdAK() {
      this.akData.id_kk = this.$route.params.id;
    },
  },
  mounted() {
    this.getAK();
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
      aKDataTable: null,
      success: false,
      isDisabled: true,
    };
  },
};
</script>

<style></style>
