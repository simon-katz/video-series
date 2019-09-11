(ns app.model.item
  (:require [com.fulcrologic.fulcro.mutations :refer [defmutation]]))

(defmutation set-item-price [{:item/keys [id price]}]
  (action [{:keys [state]}]
    (swap! state assoc-in [:item/id id :item/price] price))
  (remote [_] true))
