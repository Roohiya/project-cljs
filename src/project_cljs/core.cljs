(ns project-cljs.core
  (:require [rum.core :as rum]
            [project-cljs.cards]
            [project-cljs.page-1 :as page-1]
            [project-cljs.page-2 :as page-2]
            ))

(enable-console-print!)

(rum/defc app [state]
  (let [page-number (get @state :page-number 1)]
    (println "page " page-number)
  [:div {:style {:overflow "hidden"}}
   [:div {:style {:width "200vw"
                  :height "100vh"
                  :transform (if (= page-number 1) "translate(0, 0)" "translate(-100vw, 0)")
                  :transition "transform .5s"
                  :display "flex"}}
    (page-1/page-1-block state)
    (page-2/page-2-block state)]]))

;; MAIN PART
(defonce app-state (atom {}))

(defn main []
  (if-let [node (.getElementById js/document "main-app-area")]
    (.render js/ReactDOM (app app-state) node)))

(main)
(add-watch app-state :watch #(main))

;; (defn on-js-reload []
;; optionally touch your app-state to force rerendering depending on
;; your application
;; (swap! app-state update-in [:__figwheel_counter] inc)
;;)
