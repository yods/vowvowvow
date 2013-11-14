(ns vowvowvow.core)

(def a {:a 1})
(def b {:a 1 :b 2})

(defn features
  "turns a given map of features into vw compatible string"
  [features-map]
  (for [[k v] features-map] (str k ":" v)))
