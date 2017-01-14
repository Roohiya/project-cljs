(ns project-cljs.cards
  (:require [rum.core :as rum])
  (:require-macros
   [devcards.core :as dc :refer [defcard deftest]]))

(rum/defc animations-loading [state]
  [:div {:class "main"}
   [:div {:class "small-button-class"}
    [:div {:class "button"}]]
   [:div {:class "big-button"}]])

(defcard first-defcard
  (fn [state]
    (animations-loading state))
  ; {}
  {:inspect-data true})
