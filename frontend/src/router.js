
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DriveFileManager from "./components/listers/DriveFileCards"
import DriveFileDetail from "./components/listers/DriveFileDetail"

import IndexerIndexingManager from "./components/listers/IndexerIndexingCards"
import IndexerIndexingDetail from "./components/listers/IndexerIndexingDetail"

import VideoProcessingProcessingManager from "./components/listers/VideoProcessingProcessingCards"
import VideoProcessingProcessingDetail from "./components/listers/VideoProcessingProcessingDetail"

import NotificationNotiManager from "./components/listers/NotificationNotiCards"
import NotificationNotiDetail from "./components/listers/NotificationNotiDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/drives/files',
                name: 'DriveFileManager',
                component: DriveFileManager
            },
            {
                path: '/drives/files/:id',
                name: 'DriveFileDetail',
                component: DriveFileDetail
            },

            {
                path: '/indexers/indexings',
                name: 'IndexerIndexingManager',
                component: IndexerIndexingManager
            },
            {
                path: '/indexers/indexings/:id',
                name: 'IndexerIndexingDetail',
                component: IndexerIndexingDetail
            },

            {
                path: '/videoProcessings/processings',
                name: 'VideoProcessingProcessingManager',
                component: VideoProcessingProcessingManager
            },
            {
                path: '/videoProcessings/processings/:id',
                name: 'VideoProcessingProcessingDetail',
                component: VideoProcessingProcessingDetail
            },

            {
                path: '/notifications/notis',
                name: 'NotificationNotiManager',
                component: NotificationNotiManager
            },
            {
                path: '/notifications/notis/:id',
                name: 'NotificationNotiDetail',
                component: NotificationNotiDetail
            },




    ]
})
