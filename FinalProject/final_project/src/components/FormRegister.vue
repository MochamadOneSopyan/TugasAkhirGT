<template>
  <div class="d-flex justify-content-center my-5">
    <div class="col-md-10">
      <section class="vh-100">
        <div class="container-fluid h-custom p-5">
          <div
            class="row d-flex justify-content-center align-items-center h-100"
          >
            <div class="col-md-9 col-lg-6 col-xl-5">
              <img
                src="@/assets/img/ktp.png"
                class="img-fluid"
                alt="Sample image"
              />
            </div>
            <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
              <form>
                <!-- <div
                  class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start"
                >
                  <p class="lead fw-normal mb-4 me-3">Daftar</p>
                </div> -->
                <h1 style="text-align: center">{{ $route.name[length] }}</h1>
                <!-- Email input -->
                <div class="form-outline mb-4" v-show="!register">
                  <label class="form-label" for="form3Example3"
                    >Nama Lengkap</label
                  >
                  <input
                    type="text"
                    id="form3Example3"
                    class="form-control form-control-lg"
                    placeholder="Nama Lengkap"
                  />
                </div>
                <div class="form-outline mb-4">
                  <label class="form-label" for="form3Example3">Email</label>
                  <input
                    type="email"
                    id="form3Example3"
                    class="form-control form-control-lg"
                    placeholder="Email"
                  />
                </div>

                <!-- Password input -->
                <div class="form-outline mb-3">
                  <label class="form-label" for="form3Example4">Password</label>
                  <input
                    type="password"
                    id="form3Example4"
                    class="form-control form-control-lg"
                    placeholder="Password"
                  />
                </div>
                <div class="form-outline mb-3" v-show="!register">
                  <label class="form-label" for="form3Example4"
                    >Re Password</label
                  >
                  <input
                    type="password"
                    id="form3Example4"
                    class="form-control form-control-lg"
                    placeholder="Repassword"
                  />
                </div>

                <!-- <div class="d-flex justify-content-between align-items-center"> -->
                <!-- Checkbox -->
                <!-- <div class="form-check mb-0">
                    <input
                      class="form-check-input me-2"
                      type="checkbox"
                      value=""
                      id="form2Example3"
                    />
                    <label class="form-check-label" for="form2Example3">
                      Remember me
                    </label>
                  </div>
                  <a href="#!" class="text-body">Forgot password?</a>
                </div> -->

                <div class="text-center text-lg-start mt-4 pt-2">
                  <button
                    type="button"
                    class="btn btn-primary btn-lg"
                    style="padding-left: 2.5rem; padding-right: 2.5rem"
                  >
                    Login
                  </button>
                  <p class="small fw-bold mt-2 pt-1 mb-0">
                    Don't have an account?
                    <!-- <router-link to="/" @click="register = !register">
                      <a class="link-danger">Register</a>
                    </router-link> -->

                    <a
                      href="#!"
                      class="link-danger"
                      @click="register = !register"
                      >Register</a
                    >
                  </p>
                </div>
              </form>
            </div>
          </div>
        </div>
      </section>
    </div>
  </div>
</template>

<script>
export default {
  name: "formRegister",

  data() {
    return {
      register: false,
      // register: this.$route.path,
    };
  },
};
</script>

<style scoped>
.h-custom {
  background-color: #8dc5c9;
}
</style>
