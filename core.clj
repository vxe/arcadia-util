(ns arcadia-util.core
  (:use arcadia.core)
  (:import [UnityEngine GameObject Time Mathf Transform]))




(defn rotate [obj role-key]
  (.. obj transform (Rotate 0 1 0)))


(defn vec-3 [v]
  (let [[x y z] v]
    (UnityEngine.Vector3. x y z)))
