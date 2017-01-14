(ns project-cljs.page-2
  (:require
   [rum.core :as rum :include-macros true]))

(rum/defc page-2-block [state]
  [:div {:class "page-2-block"}
   [:div {:class "button-back"
          :on-click #(swap! state assoc :page-number 1)} "Back"]])
