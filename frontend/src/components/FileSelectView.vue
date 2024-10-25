<template>

    <v-data-table
        :headers="headers"
        :items="fileSelect"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'FileSelectView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            fileSelect : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/fileSelects'))

            temp.data._embedded.fileSelects.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.fileSelect = temp.data._embedded.fileSelects;
        },
        methods: {
        }
    }
</script>

