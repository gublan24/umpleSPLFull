# FOSD UmpleSPL

This repository contains fully compositional fragments using the mixset approach for the Umple SPL. The master branch in Umple repository, however, consists of combined variability.

We implemented a specific generator called AnnotativeToComposition in Umple to accomplish the transformation of annotative variability into compositional variability. The generator moves all annotative fragments into proper compositional fragments. For coarse grained variability fragments, the generator gathers all fragments of each mixset and then produces compositional counterparts. The generator automatically generates labeled aspects for all fine-grained variability fragments. Fully automating the refactoring from annotative to compositional mixsets has not been achieved yet, since the generator does not remove mixsets occurring in the original Umple files.
