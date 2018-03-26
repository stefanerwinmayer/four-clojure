(ns problem90
  (:require [clojure.math.combinatorics :as combo]))

(def test-cases
  '[(= (__ #{"ace" "king" "queen"} #{"&#9824;" "&#9829;" "&#9830;" "&#9827;"})
       #{["ace" "&#9824;"] ["ace" "&#9829;"] ["ace" "&#9830;"] ["ace" "&#9827;"]
         ["king" "&#9824;"] ["king" "&#9829;"] ["king" "&#9830;"] ["king" "&#9827;"]
         ["queen" "&#9824;"] ["queen" "&#9829;"] ["queen" "&#9830;"] ["queen" "&#9827;"]})
    (= (__ #{1 2 3} #{4 5})
       #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})
    (= 300 (count (__ (into #{} (range 10))
                      (into #{} (range 30)))))])

(def __
  #(set (for [a %1
              b %2]
          [a b]))
  )

(__ #{1 2 3} #{4 5})

(test-code)

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
