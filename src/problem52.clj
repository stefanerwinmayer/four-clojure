(ns problem52)

(def test-cases
  '[(= [2 4]
       (let [[a b c d e]
             [0 1 2 3 4]]
         __))])

(def __
  [2 4]
  )

(defn test-code
  []
  (doseq [[test-case test-number] (map vector test-cases (range))]
    (if (eval `(let [~'__ __]
                 ~test-case))
      (printf "Test #%d passed!\n" (inc test-number))
      (printf "Test #%d failed!\n" (inc test-number)))))
