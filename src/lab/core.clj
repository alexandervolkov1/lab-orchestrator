(ns lab.core)

(defn measurement-label
  [{:keys [name value unit]}]
  (str name ": " value " " unit))
