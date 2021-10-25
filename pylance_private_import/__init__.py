"""pylance-private-import"""
from typing import Sequence

# version information
__version__ = '0.0.1'

from ._internal.some_internal_file import do_something

# Some python nonsense
__all__: Sequence[str] = (
    'do_something',
)
