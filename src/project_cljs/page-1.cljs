(ns project-cljs.page-1
  (:require
   [rum.core :as rum :include-macros true]))

(rum/defc page-1-block [state]
  [:div {:class "page-1-block"}
   [:div {:class "button-next"
          :on-click #(swap! state assoc :page-number 2)} "Next"]])
