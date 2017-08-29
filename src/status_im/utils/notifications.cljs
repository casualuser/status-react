(ns status-im.utils.notifications
  (:require [status-im.react-native.js-dependencies :refer [react-native-fcm]]))

;; Work in progress namespace responsible for push notifications and interacting
;; with Firebase Cloud Messaging.

(def fcm (aget react-native-fcm "default"))
(def fcm-event (aget react-native-fcm "FCMEvent"))

(defn get-fcm-token []
  (.then ((.-getFCMToken fcm))
         (fn [x] (println "*** FCM TOKEN" x))))
