(ns problem83)

(def test-cases
  '[(= false (__ false false))
    (= true (__ true false))
    (= false (__ true))
    (= true (__ false true false))
    (= false (__ true true true))
    (= true (__ true true true false))])

(def __
  #(= (count (set %&))
      2)
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
