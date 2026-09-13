(ns lab.mock)

(def instruments
  [{:id :furnace-1
    :name "Training furnace"
    :kind :furnace}])

(defn list-instruments []
  instruments)
