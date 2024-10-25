<template>

    <v-data-table
        :headers="headers"
        :items="fileList"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'FileListView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            fileList : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/fileLists'))

            temp.data._embedded.fileLists.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.fileList = temp.data._embedded.fileLists;
        },
        methods: {
        }
    }
</script>

