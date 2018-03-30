(ns problem100)

(def test-cases
  '[(== (__ 2 3) 6)
    (== (__ 5 3 7) 105)
    (== (__ 1/3 2/5) 2)
    (== (__ 3/4 1/6) 3/2)
    (== (__ 7 5/7 2 3/5) 210)])

(def __
  #(if (zero? %2)
     %1
     (recur %2 (mod %1 %2)))
  )
  )

#(apply min (clojure.set/intersection
              (set (take 100 (iterate (partial + 2) 2)))
              (set (take 100 (iterate (partial + 3) 3)))))



(test-code)
(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
